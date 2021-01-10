Number_of_lines = $(wc -l /home/nikhil/myapp.log | awk '{print $1}')
echo ${Number_of_lines}
if [ $((Number_of_lines%2)) -eq 0 ]
then
  echo "Number is even."
else
  echo "Number is odd."
fi
