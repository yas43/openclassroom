package yash_yaser;

import java.util.Arrays;

public class Copy_array {
	static void my_customized_copy_array(int[] array_1, int start_ind_array_1, int[] array_2, int start_ind_array_2,
			int length) {
		for (int j = start_ind_array_1; j < (start_ind_array_1 + length); j++) {
			array_1[j] = array_2[start_ind_array_2];
			start_ind_array_2++;
		}

	}

	public static void main(String[] args) {
		int[] array_1 = { 10, 8, -6, 83, 12, 3 };
		int[] array_2 = new int[7];
		System.out.println("array_1 befor using arraycopy" + Arrays.toString(array_1)
				+ "\narray_2 befor using arraycopy" + Arrays.toString(array_2));

		System.arraycopy(array_2, 1, array_1, 1, 3);
		// my_customized_copy_array(array_1, 1, array_2, 1, 3);

		System.out.println("array_2 after using arraycopy" + Arrays.toString(array_1));
		// System.out.println("array_2 after using my_customized_copy_method" +
		// Arrays.toString(array_1));

	}

}
