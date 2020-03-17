# Collection which helps in parsing strings for expressions
# details about it can be found on python.org
import re
pattern = ["this", "that", "there"]

text = "this is the passage that talks about syria civil war and nothing other than that"

for i in pattern:
    if re.search(i, text):
        print('Match found')
    else:
        print('No match found')

# Another technique
match = re.search(pattern[0], text)
print(match)
print(match.string)