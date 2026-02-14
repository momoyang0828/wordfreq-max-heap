class WordFreq {
    String word;
    int frequency;

    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }
}

public class MaxHeapWordFreq {

    static int heapSize;

    public static void main(String[] args) {

        WordFreq[] arr = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };
        buildMaxHeap(arr);
        for (WordFreq wf : arr) {
            System.out.println(wf.word + ": " + wf.frequency);
        }
        System.out.println("Is max heap: " + isMaxHeap(arr));
    }

    static int left(int i) {
        return 2 * i + 1;
    }

    static int right(int i) {
        return 2 * i + 2;
    }

    static void swap(WordFreq[] arr, int i, int j) {
        WordFreq temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void maxHeapify(WordFreq[] arr, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < heapSize && arr[l].frequency > arr[largest].frequency) {
            largest = l;
        }

        if (r < heapSize && arr[r].frequency > arr[largest].frequency) {
            largest = r;
        }

        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest);
        }
    }
    static void buildMaxHeap(WordFreq[] arr) {
        heapSize = arr.length;
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    static boolean isMaxHeap(WordFreq[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l < arr.length && arr[i].frequency < arr[l].frequency) return false;
            if (r < arr.length && arr[i].frequency < arr[r].frequency) return false;
        }
        return true;
    }

}
