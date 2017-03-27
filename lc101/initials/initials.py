def get_initials(fullname):
    name_split = fullname.split()

    outputString = ""

    for word in name_split:
        outputString = outputString + word[0][0].upper()

    return outputString
def main():
    fullname = input("Please Enter Your Full Name: ")
    print(get_initials(fullname))
if __name__ == '__main__':
    main()
