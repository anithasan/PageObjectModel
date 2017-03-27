from helpers import alphabet_position, rotate_character

def encrypt(text, key):
    keylength = len(key)
    keyincrement = 0
    newtext = []
    keylist = list(key)

    for i in range(len(text)):
        chartoencrypt = text[i]
        newchar = text[i]
        if chartoencrypt.isalpha():
            keychar = keylist[keyincrement]
            rotateby = alphabet_position(keychar)
            newchar = rotate_character(chartoencrypt, rotateby)
            keyincrement = keyincrement+1
            if (keyincrement > keylength-1):
                keyincrement = 0
        newtext.append(newchar)
    return ''.join(newtext)

def main():
    from sys import argv

    text =input("Type a message:")
    
    print(encrypt(text, argv[1]))
if __name__ == '__main__':
    main()
