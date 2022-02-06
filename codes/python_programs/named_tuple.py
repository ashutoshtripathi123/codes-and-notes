# Normal tuple
from collections import namedtuple
t = (1,2,3,4)
print(t[0])


# Named Tuple
family = namedtuple('family', 'first second third')
picnic_party = family(first = 'bolly', second = 'tolly', third = 'holly')
print(picnic_party.first)
print(picnic_party.second)
print(picnic_party.third)
