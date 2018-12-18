public class Main {

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr.length == 0 ? 0 : arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        String[] arr = " ".split(" ");
        System.out.println();


    }

}
