package edu.knoldus

class Searching {

  def binarySearch(arr: Array[Int], left: Int, right: Int, search: Int): Int = {
    arr.sorted
    if (right > left) {
      val mid = left + (right - 1) / 2
      if (arr(mid) == search) {
        mid
      }
      else if (arr(mid) > search) {
        binarySearch(arr, left, mid - 1, search)
      }
      binarySearch(arr, mid + 1, right, search)
    }
    -1
  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    val result = binarySearch(array, 0, array.length - 1, elem)
    if (result != -1) {
      true
    }
    else {
      false
    }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    for (x <- array) {
      if (x == elem) {
        true
      }
    }
    false
  }
}
