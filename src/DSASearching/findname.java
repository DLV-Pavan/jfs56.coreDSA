package DSASearching;

public class findname {

    public static void main(String[] args) {

        String names[] = {"bahu", "cartoon", "deathrace"};

        String target = "cartoon";

        int left = 0;
        int right = names.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int cmp = names[mid].compareTo(target);

            if (cmp == 0) {
                System.out.println("Name found at index: " + mid);
                return;
            } 
            else if (cmp < 0) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        System.out.println("Name not found");
    }
}