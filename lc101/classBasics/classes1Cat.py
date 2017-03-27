#A cat has-a

#Tail length - float/int
#Color - string*
#Fur/fur length  - float/int
#smell - string
#name - string*
#breed - string
#number of legs - int
#isMale - boolean*
#meow - string*
#position - point
#age - int*

#Can-dos

#jump(height)
#sleep(duration)*
#run(distance, angle)
#hunt(prey)
#play(toy)
#purr()
#meow()*

class Cat:

	def __init__(self, color, name, isMale, meow):
		self.color = color
		self.name = name
		self.isMale = isMale
		self.meow = meow
		self.age = 0

	def sleep(self, duration):
		print(self.name + " slept for " + str(duration) + " minutes.")

	def getOlder(self):
		self.age += 1

	def makeMeow(self):
		print(self.name + "says: " + self.meow)

	def getAge(self):
		return self.age

	def getName(self):
		return self.name

	def setName(self, newName):
		self.name = newName

franklin = Cat("Orange", "Franklin", True, "MROOOW")
franklin.sleep(60)
franklin.makeMeow()

sally = Cat("Tortiseshell", "Sally", False, "mew")
sally.makeMeow()
sally.sleep(50)
