class BaseballPlayer:

    def __init__(self, name, team, isBatRight, age = 18):
        self.name = name
        self.team = team
        self.isBatRight = isBatRight
        self.age = age

    def __str__(self):
        if self.isBatRight == True:
            handed = "right handed"
        else:
            handed = "left handed"
        return str(self.name) + " plays for the " + str(self.team) + ". He is " + str(self.age) + " years old and bats " + handed + "."

    # Set the player's stats. Assumed to be the beginning of
    # the year if no parameters are provided.
    def setStats(self, ab = 0, h = 0, r = 0, hr = 0, rbi = 0, so = 0, obp = 0, sb = 0):
        self.ab = ab
        self.h = h
        self.r = r
        self.hr = hr
        self.rbi = rbi
        self.so = so
        self.obp = obp
        self.sb = sb
        self.stats = {"ABs": self.ab, "hits": self.h,
		"runs": self.r, "home runs": self.hr,
                "RBIs": self.rbi, "strike outs": self.so,
		"OBP": self.obp, "stolen bases": self.sb}

    # Gives all stats unless specific stat is specified.
    def getStats(self, statType = None):
        if statType != None:
            return self.stats.get(statType)
        return self.stats

    def getAge(self):
        return self.age

    def advanceYear(self):
        self.age += 1

    # Adds specified amount to one type of stat
    def addToStat(self, statType, statValue):
        self.stats[statType] += statValue


kirby = BaseballPlayer("Kirby Pucket", "Twins", True, 32)
print(kirby)

kirby.setStats(500, 300, 82, 22, 101, 115, 0.337, 9)
print(kirby.getStats())
kirby.addToStat("hits", 30)
print(kirby.getStats("hits"))

kirby.advanceYear()
print(kirby.name + " is now " + str(kirby.getAge()) + " years old.")
# It's a new year, must reset his stats
kirby.setStats()
print(kirby.getStats())
