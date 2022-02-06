class Human:
    race = 'human'
    def __init__(self, n, o, m):
        self.name = n
        self.occupation = o
        self.income = m

    def do_work(self):
        if self.occupation == "badminton":
            print(self.name, "Plays badminton")
        elif self.occupation == "actor":
            print(self.name, "Acts in Movies")


    def show_income(self):
        if self.occupation == "badminton":
            print(self.name, "Income = ", self.income)
        elif self.occupation == "actor":
            print(self.name, "Income = ", self.income)

    def speak(self):
        print("Race:", self.race,"...",self.name,"says how are you ?")

amitabh = Human("Amitabh Bachchan", "actor", 10000)
amitabh.do_work()
amitabh.show_income()
amitabh.speak()

saina = Human("Saina Nehwal", "badminton", 5000)
saina.do_work()
saina.show_income()
saina.speak()






