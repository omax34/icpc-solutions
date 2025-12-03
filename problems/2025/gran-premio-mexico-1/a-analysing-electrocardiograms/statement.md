A. Analysing Electrocardiograms
time limit per test 1 second
memory limit per test256 megabytes
    
Dr. Cristina Yang is one of the best cardiologists in the world and you are her new student! To get you started, she has given you an easy task. You'll be given an example of how the heartbeat of a healthy heart looks in the form of a string S
, and N
 electrocardiograms, each one is a string P
, your task is to say if it's healthy or not. A healthy electrocardiogram is one which is made by concatenating multiple times the string S
.

Input
In the first line a string S
 (1≤|S|≤100
) the example of the healthy heart. In the second line a number N
 (1≤N≤103
)the number of electrocadiograms you have to examine. In the next N
 lines a string P
 (1≤|P|≤105
), the electrocardiogram to examine. It is assured that the sum of the lengths of the N
 strings is less than 105
, and all strings are made of uppercase english characters.

Output
Print N
 lines, each one having either "Yes" or "No", corresponding to if the heart is healthy or not.