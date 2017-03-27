#A rectangle has a length and a width. A rectangle should be able to
# provide its area and perimeter. A rectangle can indicate whether it is
#smaller than another rectangle in terms of area. A rectnagle
#can indicate whether it is in fact a square."""
#a Rectangle has-a
#corner
#length
#width

#can have
#area
#perimeter
#compare
#is it a square
#A=wl
#P=2(l+w)
class Point:
    def _init_ (self, initx, inity):
        self.x = initx
        self.y = inity

    def getx(self):
        return self.x

    def gety(self):
        return self.y

    def _str_(self):
        return "x=" + str(self.x) + ", y=" + str(self.y)
class Rectangle:

    def _init_ (self,corner, height, width):

        self.corner = corner
        self.length = height
        self.width = width

    def getLength(self):
        return self.height

    def getWidth(self):
        return self.width

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return 2*(self.width + self.height)

    #def compareRectangle(self):



#rectangle =Rectangle(4,6)

r = Rectangle(Point(0, 0), 10, 5)
print(r.perimeter(), 30)
print(r.area(), 50)
