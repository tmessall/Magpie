# Start -

* my mother and I talked last night - tell me more about your family
* i said no! - why so negative?
* the weather is nice - you don't say/hmmm./ do you really think so?
* do you know my brother? - why so negative? (i think that the bot sees the string "no" anywhere and responds as if the user simply said "no". i confirmed this by testing it further.)

# Exercises -

## Three New Keywords (and responses)

* friend (what are your friends like?)
* school (how is school going?)
* house (what does your house look like?)

## Multiple Keywords 

Because the reply method for Magpie uses else if statements, the statement that appears higher in the else if chain will be prioritized. For example, if mother appears before cat in the if statements, then the mother response will appear because it is checked for first, even if cat comes before mother in the user input statement.