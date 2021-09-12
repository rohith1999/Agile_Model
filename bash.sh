#!/bin/bash
#1 and 2
#cat <<EOF > places.txt
#delhi
#goa
#bangalore 
#chennai 
#EOF
#sort places.txt > places_sorted.txt
#sort  -r places.txt > places_sorted.txt

#3
#cat <<EOF > name_age.txt
#rohith-25
#amith-35
#manju-45 
#ramesh-5 
#EOF
#cut -d "-" -f2 name_age.txt

#4
#cat <<EOF > happy.txt
#im happy
#happy man
#he/she is sad
#hey everybody
#EOF
#grep -w "^happy" happy.txt

#5
#ls -R

#6 
#cat <<EOF > count.txt
#This is shell scripting
#the use cases are easy.
#EOF
#wc count.txt


#7
#cat <<EOF > count_number_lines.txt
#124346543
#hey im 123
#93486583
#number 
#word
#letter
#000000
#EOF
#grep -n "^[0-9]" count_number_lines.txt 

#8
#cat <<EOF > num_letters.txt
#123hi
#hey345
#jackandjill
#merrygo10timesround
#EOF
#cat num_letters.txt |grep "[0-9]"| tr -d "[0-9]" > letters_only.txt
#cat letters_only.txt

#9
#cat <<EOF > line_numbers.txt
#123hi
#hey345
#jackandjill
#merrygo10timesround
#EOF
#cat -n line_numbers.txt

#10
cat <<EOF > file1.txt
123hi
hey345
jackandjill
merrygo10timesround
EOF
cat <<EOF > file2.txt
BANGALORE
KOLKATA
NUMBERS
LETTERS
EOF
cat file1.txt | tr "[a-z]" "[A-Z]"
cat file2.txt | tr "[A-Z]" "[a-z]"










