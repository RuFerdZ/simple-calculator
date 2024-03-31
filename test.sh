#!/bin/bash

# Define the base URL
base_url="http://localhost:8080/calc/"

# Define the endpoints for each operation
endpoints=(
    "add?a=100&b=2"
    "subtract?a=100&b=2"
    "multiply?a=100&b=2"
    "divide?a=100&b=2"
)

# Define the expected results for each operation
expected_results=(
    "102"
    "98"
    "200"
    "50"
)

# Define the operation names
operations=(
    "Addition"
    "Subtraction"
    "Multiplication"
    "Division"
)

# Initialize array to store test results
test_results=()

# Loop through each operation
for ((i=0; i<${#endpoints[@]}; i++)); do
    # Make the curl request and store the result
    echo "Making request to: $base_url${endpoints[$i]}"
    result=$(curl "$base_url${endpoints[$i]}")
    echo "Result: $result"

    # Check if the result matches the expected result
    if [ "$result" = "${expected_results[$i]}" ]; then
        test_results+=("${operations[$i]}: Success")
    else
        test_results+=("${operations[$i]}: Error")
    fi
done

# Print the test results
echo "Test Results:"
printf '%s\n' "${test_results[@]}"

echo "End: (enter)"
read x