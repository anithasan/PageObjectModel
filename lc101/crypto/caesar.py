
from helpers import alphabet_position, rotate_character


def encrypt(text, rot):

    rot = int(rot)
    encrypted = ''
    for char in text:
        encrypted = encrypted + rotate_character(char, rot)

    return encrypted

def main():
    from sys import argv
    text = input("Type a messsage:")
    print(encrypt(text, argv[1]))
if __name__ == '__main__':
    main()
