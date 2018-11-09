# Exploration -

## Using the API

* indexOf(String substring) returns -1 if the substring does not occur in the string
* indexOf(String substring, int fromIndex) checks for the substring starting from a specific index

## Understand the New Method

* findKeyword("She's my sister", "sister", 0);
	iteration: 1
	psn: 9
	before: " "
	after: null
* findKeyword("Brother Tom is helpful", "brother", 0);
	iteration: 1
	psn: 0
	before: null
	after: " "
* findKeyword("I can't catch wild cats.", "cat", 0);
	iteration: 1, 2
	psn: 8, 19
	before: " ", " "
	after: "c", "s"
* findKeyword("I know nothing about snow plows.", "no", 0);
	iteration: 1, 2, 3
	psn: 4, 8, 23
	before: "k", " ", "s"
	after: "w", "t", "w"