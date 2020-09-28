echo "what assignment to zip: ";
read;
jar -cfM Sun_Paul_Assignment${REPLY}.zip ../Sun_Paul/src/assignment${REPLY};

# checks if file exists
if [ -f "Sun_Paul_Assignment${REPLY}.zip" ]; 
then
    echo "assignment successfully zipped";
else
    echo "something went wrong oops lol";
fi

# keeps window open till a key is pressed
echo
read -rsn1 -p "Press any key to continue..."