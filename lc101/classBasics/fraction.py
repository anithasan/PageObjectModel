#Has-a

#numerator - int
#denominator - int

#Can-do

#add(fraction) output: fraction
#multiply(fraction) output: fraction
#reciprocal() output: fraction
#simplify() output: fraction
def gcd(m, n):
    while m % n != 0:
        oldm = m
        oldn = n

        m = oldn
        n = oldm % oldn

    return n

class Fraction:

	def __init__(self, num, denom):
		self.numerator = num
		self.denominator = denom

	def add(self, operand):
		commonDenom = self.denominator * operand.denominator
		newNumerator1 = self.numerator * operand.denominator
		newNumerator2 = operand.numerator * self.denominator
		finalNumerator = newNumerator1 + newNumerator2
		answer = Fraction(finalNumerator, commonDenom)
		return answer

	def multiply(self, operand):
		return Fraction(self.numerator * operand.numerator, self.denominator * operand.denominator)

	def reciprocal(self):
		return Fraction(self.denominator, self.numerator)


	def simplify(self):

		common = gcd(self.numerator,self.denominator)
		self.numerator /=common
		self.denominator /=common

	def __str__(self):
		return str(self.numerator) + "/" + str(self.denominator)


f1 = Fraction(2, 3)
f2 = Fraction(1, 4)
print(f1.add(f2))
print(f1.multiply(f2))
print(f1.reciprocal())
myfraction = Fraction(12, 16)

myfraction = Fraction(12, 16)
print(myfraction)
myfraction.simplify()
print(myfraction)
