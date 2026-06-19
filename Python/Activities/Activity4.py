I=input("Do you wnat to continue playing, Enter your response- yes/No: ")
while I=='yes':
    x=input("Enter user input for player 1")
    y=input("Enter user input for player 2")

    if x==y:
        print("Its a Tie")
    else:
        if ((x =="Rock") and (y=="Paper")) or ((x=="Rock") and (y=="Scissors")) or (((x =="Scissors") and (y=="Paper"))) :
            print("Player1 is winner")
        elif ((x =="Paper") and (y=="Rock")) or ((x=="Scissors") and (y=="Rock")) or  (((x =="Scissors") and (y=="Paper")))  :
            print("Player2 is winner")
        else:
            print("invalid Input")
    break
else:
    print("Game ended")
