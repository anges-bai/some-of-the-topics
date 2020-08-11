private static void kuaipai(int[] arr, int left, int right) {
		if (left >= 0 && left < arr.length && right >= 0 && right < arr.length && left < right) {
			int i = left;
			int j = right;
			int vol = arr[i];
			while (i != j) {
				while (i < j && arr[j] >= vol) {
					j--;
				}
				if (i < j) {
					arr[i++] = arr[j];
				}
				while (i < j && arr[i] <= vol) {
					i++;
				}
				if (i < j) {
					arr[j--] = arr[i];
				}
			}
			arr[i] = vol;
			kuaipai(arr, left, i - 1);
			kuaipai(arr, j + 1, right);
		}
	}
