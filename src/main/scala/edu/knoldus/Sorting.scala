package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    //val n =
    for (i <- 1 until array.length) {
      var j = i
      val temp = array(i)
      while (j > 0 && temp < array(j - 1)) {
        array(j) = array(j - 1)
        j = j - 1
      }
      array(j) = temp
    }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for (i <- 0 until array.length - 1) {
      var index = i
      for (j <- i + 1 until array.length) {
        if (array(j) < array(index)) {
          index = j
        }
      }
      val small = array(index)
      array(index) = array(i)
      array(i) = small
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for (i <- 0 until array.length) {
      for (j <- 1 until array.length - i) {
        if (array(j - 1) > array(j)) {
          val temp = array(j - 1)
          array(j - 1) = array(j)
          array(j) = temp
        }
      }
    }
    array
  }
}
