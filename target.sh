num_of_lines = $(wc -l /home/nikhil/app.log | awk'{print $1}')
echo ${num_of_lines}
if [ $((num_of_lines%2)) -eq 0 ]
then
  echo "Number is even."
else
  echo "Number is odd."
fi
done
