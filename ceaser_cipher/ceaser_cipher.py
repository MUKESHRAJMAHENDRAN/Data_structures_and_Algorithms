# Character shifting(Both encryption and decryption)
# For more need look into the notes
#Enc
def encoder(message, shifting):
    enc = "" #create a store the output
    for i in message:
        if i.isupper():
            code = 65 + ((ord(i) + shifting) % 65)
            enc = enc + chr(code)
        else:
            enc = enc + i #For space
    return enc

print(encoder("MUKESH", 3)) # ans PXNHVK

#Dec
def decoder(message, shifting):
    dec = ""
    for i in message:
        if i.isupper():
            code = 65 + ((ord(i) - shifting) % 65)
            dec = dec + chr(code)
        else:
            dec = dec + i
    return dec

print(decoder("PXNHVK", 3))