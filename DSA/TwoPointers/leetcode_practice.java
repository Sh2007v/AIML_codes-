package DSA.TwoPointers;

public class leetcode_practice {
    //1: 881 — Boats to Save People
//     class Solution {
//     public int numRescueBoats(int[] people, int limit) {

//         int low = 0;
//         int high = people.length - 1;

//         int boat_ct = 0;

//         // Sorting
//         for(int i = 0; i < people.length; i++) {
//             for(int j = i + 1; j < people.length; j++) {

//                 if(people[i] > people[j]) {
//                     int temp = people[i];
//                     people[i] = people[j];
//                     people[j] = temp;
//                 }
//             }
//         }

//         while(low <= high) {

//             if(people[low] + people[high] <= limit) {
//                 low++;
//                 high--;
//             }
//             else {
//                 high--;
//             }

//             boat_ct++;
//         }

//         return boat_ct;
//     }
// }


//2
    
}
