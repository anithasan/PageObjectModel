test_string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus."

#loop through characters in string
#dictionary - characters, count
count = {}
locations = {}
index = 0


for char in test_string:
    if char in count:
        count[char] +=1
        locations[char].append(index)
    else:
        count[char] = 1
        locations[char] = [index] #creating a brand new list
    index+=1


for (k, v) in count.items():
    print(k+": "+ str(v))
    print(k + ":" + str(locations[k]))
