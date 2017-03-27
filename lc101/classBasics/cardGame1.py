# class declaration
class Card():
	# most classes have __init__
	# this the "constructor"
	# here we take two values, faceNum and suitNum
	# all object methods also take the value of self ( or "this" )
	# which implicitly references the current object when called
	def __init__(self, faceNum, suitNum):
		# here, the values passed are assigned to the
		# object itself
		self.faceNum = faceNum
		self.suitNum = suitNum

	# a method that when called will take no parameters
	# note, still needs self
	def getCardName(self):
		# declare the arrays to do lookup
		nameSuit = ['Hearts', 'Diamonds', 'Spades', 'Clubs']
		nameFace = ['Ace', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King']
		# the first part here is the format mask, "%s of %s"
		# which says I expect you to give me a set with two strings
		# the second part is the set, using the values assigned to
		# the current object to do the lookup
		# and return the result
		return "%s of %s" % (nameFace[self.faceNum], nameSuit[self.suitNum])

# a function
def Make_Deck():
	# create an empty list
	deck = []
	# here range is expanded to [0,1,2,3]
	# so suitNum will loop four times with those values
	for suitNum in range(4):
		# another loop, same idea
		for faceNum in range(13):
			# we create a new card object with the current values of the loop
			newCard = Card(faceNum, suitNum)
			# we add that object to our list
			deck.append(newCard)
	# when we're done with our loops, we return the results
	return deck

# call our function, returns a list into variable deck
deck = Make_Deck()

# loop through all the items in deck
for card in deck:
	# we know card is of type Card
	# we call it's getCardName method for a friendly
	# print out
	print (card.getCardName())
	# we could also ask it about it's other properties, if we wanted
	print(card.faceNum)
