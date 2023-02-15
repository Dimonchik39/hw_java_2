// Создать метод, который проверяет, является ли строка палиндромом.

public class hw2_task_1 {
    public static void main(String[] args) {    
        System.out.println(isPalindrome("топот")); 
    }

    private static boolean isPalindrome (String text) {
        // text = text.replaceAll("\\p{Punct}", ""); // для удаления знаков препинания
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String data = buffer.toString();
        return text.equals(data);
    }
}
