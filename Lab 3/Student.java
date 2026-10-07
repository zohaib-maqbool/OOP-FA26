public class Student {
    String name;
    int [] Result_array;

    public Student(String name, int[] arr) {
        Result_array = new int[5];
        this.name = name;
        for(int i = 0; i<5;i++){
            this.Result_array[i] = arr[i];
        }
    }

    public double average(){
        int sum = 0;
        for (int i = 0; i < Result_array.length; i++){
            sum += Result_array[i];
        }
        return (sum/Result_array.length);
    }
}
