def word_count(string):
    #my_string = string.split()
    #my_string = list(string)
    my_dict = {}
    for item in my_string:
        #print(my_string)
        if item in my_dict:
            my_dict[item] += 1
        else:
            my_dict[item] = 1
    keys = my_dict.keys()
    #keys.sort()
    for item in keys:
        print(item+': '+ str(my_dict[item]))



word_count("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.")
