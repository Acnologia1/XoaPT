package Lession2;

public class XoaPT {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int x = 4;
        int i;
        int index = 0;
        int temp;
        //Tìm giá trị x có nằm trong mảng không.Nếu có xuất ra vị trí của X
        for (i = 0;i<arr.length;i++) {
            if (x == arr[i]) {
                x = arr[i];
                index = i;
            }
        }
        //Xoa
        for(i =0;i<arr.length-1;i++)
        {
            if(i >= index){
                temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }
        //In ra mảng
        for(i = 0;i<arr.length-2;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
