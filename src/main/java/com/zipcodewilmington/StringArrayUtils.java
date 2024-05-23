        package com.zipcodewilmington;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        /**
         * Created by leon on 1/29/18.
         */
        public class StringArrayUtils {
            /**
             * @param array array of String objects
             * @return first element of specified array
             */ // TODO
            public static String getFirstElement(String[] array) {
                return array[0];
            }

            /**
             * @param array array of String objects
             * @return second element in specified array
             */
            public static String getSecondElement(String[] array) {
                return array[1];
            }

            /**
             * @param array array of String objects
             * @return last element in specified array
             */ // TODO
            public static String getLastElement(String[] array) {
                return array[array.length - 1];
            }

            /**
             * @param array array of String objects
             * @return second to last element in specified array
             */ // TODO
            public static String getSecondToLastElement(String[] array) {
                return array[array.length - 2];
            }

            /**
             * @param array array of String objects
             * @param value value to check array for
             * @return true if the array contains the specified `value`
             */ // TODO
            public static boolean contains(String[] array, String value) {

                //given array and value in an array
                //if given value is in the array print true else false
                // boolean b=false;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == value) {
                        return true;
                    } else {
                    }


                }
                return false;
            }


//                boolean b = false;
//                for (String element : array) {
//                    if (element == value) {
//                        b = true;
//                        break;
//                    }
//                }
//                return b;

                /**
                 * @param array of String objects
                 * @return an array with identical contents in reverse order
                 */ // TODO
                public static String[] reverse (String[]array){
                    String str[] = new String[array.length];
                    int k = 0;
                    for (int i = array.length - 1; i >= 0; i--) {
                        str[k] = array[i];
                        k++;
                    }
                    return str;
                }
                /**
                 * @param array array of String objects
                 * @return true if the order of the array is the same backwards and forwards
                 */ // TODO
                public static boolean isPalindromic (String[]array){
                    String[] reversedArray = new String[array.length];
                    for (int i = 0; i < array.length; i++) {
                        reversedArray[i] = array[array.length - 1 - i];
                    }
                    return Arrays.equals(array, reversedArray);
                }
                /**
                 * @param array array of String objects
                 * @return true if each letter in the alphabet has been used in the array
                 */ // TODO
                public static boolean isPangramic (String[]array){
                    boolean[] alphabetPresent = new boolean[26];
                    for (String str : array) {
                        str = str.toLowerCase();
                        for (int i = 0; i < str.length(); i++) {
                            char ch = str.charAt(i);
                            if (Character.isLetter(ch)) {
                                alphabetPresent[ch - 'a'] = true;
                            }
                        }
                    }
                    for (boolean present : alphabetPresent) {
                        if (!present) {
                            return false;
                        }
                    }
                    return true;
                }


                /**
                 * @param array array of String objects
                 * @param value value to check array for
                 * @return number of occurrences the specified `value` has occurred
                 */ // TODO
                public static int getNumberOfOccurrences (String[]array, String value){
                    int counter = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (value.equals(array[i])) {
                            counter++;
                        }

                    }
                    return counter;
                }
                /**
                 * @param array         array of String objects
                 * @param valueToRemove value to remove from array
                 * @return array with identical contents excluding values of `value`
                 */ // TODO
                public static String[] removeValue (String[]array, String valueToRemove){
                    ArrayList<String> newArray = new ArrayList<String>();
                    for (String str : array) {
                        if (!str.equals(valueToRemove)) {
                            newArray.add(str);
                        }
                    }
                    String[] finalArr = new String[newArray.size()];
                    finalArr = newArray.toArray(finalArr);
                    return finalArr;
                }
                /**
                 * @param array array of chars
                 * @return array of Strings with consecutive duplicates removes
                 */ // TODO
                public static String[] removeConsecutiveDuplicates (String[]array){
                    ArrayList<String> newArray = new ArrayList<String>();
                    newArray.add(array[0]);
                    for (int i = 1; i < array.length; i++) {
                        if (!array[i - 1].equals(array[i])) {
                            newArray.add(array[i]);
                        }
                    }
                    String[] finalArr = new String[newArray.size()];
                    finalArr = newArray.toArray(finalArr);
                    return finalArr;
                }
                /**
                 * @param array array of chars
                 * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
                 */ // TODO
                public static String[] packConsecutiveDuplicates (String[]array){
                    if (array == null || array.length == 0) {
                        return new String[0];
                    }
                    List<String> resultList = new ArrayList<>();
                    resultList.add(array[0]);
                    for (int i = 1; i < array.length; i++) {
                        if (array[i].equals(array[i - 1])) {
                            String lastElement = resultList.get(resultList.size() - 1);
                            resultList.set(resultList.size() - 1, lastElement + array[i]);
                        } else {
                            resultList.add(array[i]);
                        }
                    }
                    return resultList.toArray(new String[0]);
                }
            }



