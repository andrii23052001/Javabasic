public class lastElementOfArray {
    public static void main(String[] args) {



   /* public static void main(String[] args) {
         int[]arr = {10,5,6,6,2323,5454645};
         int lastindex= arr[arr.length-1];
        System.out.println(lastindex);

    }

}*/

    /*    int[] myArray = {1, 2, 30, 4, 5};
        int lastIndex = -1;  // Инициализируем переменную значением по умолчанию
        for (int i = 0; i < myArray.length; i++) {
            lastIndex = myArray[i];
        }
        System.out.println(lastIndex);
        }
    }
*/

       /* int []arr={1,5,3,3,32};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
*/

        int[] arr = new int[10];

        arr[0] = 1;
        arr[1] = 121;
        arr[2] = 23232;
        arr[3] = 33;

        int lastelement = 0;  // Инициализируем lastelement значением по умолчанию

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                lastelement = arr[i];  // Обновляем lastelement на каждой итерации
            }
        }

            // После завершения цикла, lastelement будет содержать последний элемент массива
            System.out.println("Последний элемент: " + lastelement);
        }
    }
