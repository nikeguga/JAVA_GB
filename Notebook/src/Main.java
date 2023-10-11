import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Dell XPS", 8, 256, "Windows 10", "Silver"));
        notebooks.add(new Notebook("HP Spectre", 16, 512, "Windows 11", "Black"));
        notebooks.add(new Notebook("Lenovo ThinkPad", 8, 512, "Windows 10", "Silver"));
        notebooks.add(new Notebook("Acer Aspire", 16, 256, "Windows 11", "White"));
        notebooks.add(new Notebook("Asus ZenBook", 12, 512, "Windows 11", "Blue"));
        notebooks.add(new Notebook("MacBook Pro", 16, 512, "macOS", "Space Gray"));

        Map<Integer, String> filterOptions = new HashMap<>();
        filterOptions.put(1, "ОЗУ");
        filterOptions.put(2, "Объем ЖД");
        filterOptions.put(3, "Операционная система");
        filterOptions.put(4, "Цвет");

        Map<Integer, Predicate<Notebook>> filters = new HashMap<>();
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерии фильтрации (введите номера критериев, разделяя пробелом):");
        for (Integer key : filterOptions.keySet()) {
            System.out.println(key + " - " + filterOptions.get(key));
        }
        String input = scanner.nextLine();
        String[] criteria = input.split(" ");

        for (String criterion : criteria) {
            int filterCriterion = Integer.parseInt(criterion);

            if (filterOptions.containsKey(filterCriterion)) {
                if (filterCriterion == 1) {
                    System.out.println("Выберите ОЗУ из доступных вариантов (введите номер, разделяя пробелом):");
                    Set<Integer> availableRamOptions = notebooks.stream()
                            .map(Notebook::getRam)
                            .collect(Collectors.toSet());
                    int i = 1;
                    for (Integer option : availableRamOptions) {
                        System.out.println(i + " - " + option + " ГБ");
                        i++;
                    }
                    String ramInput = scanner.nextLine();
                    Set<Integer> selectedRamOptions = Arrays.stream(ramInput.split(" "))
                            .map(Integer::parseInt)
                            .map(index -> new ArrayList<>(availableRamOptions).get(index - 1))
                            .collect(Collectors.toSet());
                    filters.put(1, notebook -> selectedRamOptions.contains(notebook.getRam()));
                } else if (filterCriterion == 2) {
                    System.out.println("Выберите объем ЖД из доступных вариантов (введите номер, разделяя пробелом):");
                    Set<Integer> availableStorageOptions = notebooks.stream()
                            .map(Notebook::getStorage)
                            .collect(Collectors.toSet());
                    int i = 1;
                    for (Integer option : availableStorageOptions) {
                        System.out.println(i + " - " + option + " ГБ");
                        i++;
                    }
                    String storageInput = scanner.nextLine();
                    Set<Integer> selectedStorageOptions = Arrays.stream(storageInput.split(" "))
                            .map(Integer::parseInt)
                            .map(index -> new ArrayList<>(availableStorageOptions).get(index - 1))
                            .collect(Collectors.toSet());
                    filters.put(2, notebook -> selectedStorageOptions.contains(notebook.getStorage()));
                } else if (filterCriterion == 3) {
                    System.out.println("Выберите операционную систему из доступных вариантов (введите номер, разделяя пробелом):");
                    Set<String> availableOsOptions = notebooks.stream()
                            .map(Notebook::getOs)
                            .collect(Collectors.toSet());
                    int i = 1;
                    for (String os : availableOsOptions) {
                        System.out.println(i + " - " + os);
                        i++;
                    }
                    String osInput = scanner.nextLine();
                    Set<String> selectedOsOptions = Arrays.stream(osInput.split(" "))
                            .map(Integer::parseInt)
                            .map(index -> new ArrayList<>(availableOsOptions).get(index - 1))
                            .collect(Collectors.toSet());
                    filters.put(3, notebook -> selectedOsOptions.contains(notebook.getOs()));
                } else if (filterCriterion == 4) {
                    System.out.println("Выберите цвет из доступных вариантов (введите номер, разделяя пробелом):");
                    Set<String> availableColors = notebooks.stream()
                            .map(Notebook::getColor)
                            .collect(Collectors.toSet());
                    int i = 1;
                    for (String color : availableColors) {
                        System.out.println(i + " - " + color);
                        i++;
                    }
                    String colorInput = scanner.nextLine();
                    Set<String> selectedColors = Arrays.stream(colorInput.split(" "))
                            .map(Integer::parseInt)
                            .map(index -> new ArrayList<>(availableColors).get(index - 1))
                            .collect(Collectors.toSet());
                    filters.put(4, notebook -> selectedColors.contains(notebook.getColor()));
                }
            } else {
                System.out.println("Некорректный критерий: " + filterCriterion);
            }
        }

        for (Predicate<Notebook> filter : filters.values()) {
            filteredNotebooks = filteredNotebooks.stream()
                    .filter(filter)
                    .collect(Collectors.toSet());
        }

        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбуки, соответствующие вашим критериям, не найдены.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println("Модель: " + notebook.getModel() +
                        ", ОЗУ: " + notebook.getRam() +
                        " ГБ, Объем ЖД: " + notebook.getStorage() +
                        " ГБ, ОС: " + notebook.getOs() +
                        ", Цвет: " + notebook.getColor());
            }
        }
    }
}