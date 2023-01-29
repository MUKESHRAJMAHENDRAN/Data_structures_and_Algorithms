def encoder(message, shifting):
    enc = "" #create a store the output
    for i in message:
        if i.isupper():
            code = 65 + ((ord(i) + shifting) % 65)
            enc = enc + chr(code)
        enc = enc + i #For space
    return enc

print(encoder("MUKESH RAJ", 3)) # ans PXNHVK
