for file in myapp.log
do
 num_of_lines = $(< "$file" wc -l)

if [ $((num_of_lines%2)) -eq 0 ]
then
  echo "Number is even."
else
  echo "Number is odd."
fi
done