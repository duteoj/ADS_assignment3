public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equals("basic")){
            sorter.basicSort(copy);
        } else if (type.equals("advanced")) {
            sorter.advancedSord(copy, 0, copy.length - 1);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\nArray size: " + size);

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = randomArr.clone();
            sorter.advancedSord(sortedArr, 0, sortedArr.length - 1);

            long randomBasicTime = measureSortTime(randomArr, "basic");
            long randomAdvancedTime = measureSortTime(randomArr, "advanced");

            long sortedBasicTime = measureSortTime(sortedArr, "basic");
            long sortedAdvancedTime = measureSortTime(sortedArr, "advanced");

            sorter.advancedSord(randomArr, 0, randomArr.length - 1);

            int target = randomArr[size / 2];

            long searchTime = measureSearchTime(randomArr, target);

            System.out.println("Random array");
            System.out.println("Basic Sort Time: " + randomBasicTime + " ns");
            System.out.println("Advanced Sort Time: " + randomAdvancedTime + " ns");
            System.out.println("====================");
            System.out.println("Sorted array");
            System.out.println("Basic Sort Time: " + sortedBasicTime + " ns");
            System.out.println("Advanced Sort Time: " + sortedAdvancedTime + " ns");
            System.out.println("====================");
            System.out.println("Search Time: " + searchTime + " ns");

        }
    }
}