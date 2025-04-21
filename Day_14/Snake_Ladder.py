import pygame,random,time

pygame.init()

w = 500
h = 600
screen = pygame.display.set_mode((w,h))
snake_head = [99,89,76,66,54,43,40,27]
snake_tail = [41,53,58,45,31,18,3,5]
ladder_down = [4,13,33,42,50,62,74]
ladder_top = [25,46,63,69,81,92]


places = []
def board_index(s):
    global places
    for i in range(s,s-10,-1):
        places.append(i)
    for i in range(s-19,s-9):
        places.append(i)
board_index(100)
board_index(80)
board_index(60)
board_index(40)
board_index(20)

grids = {}
loc = 0
for i in range(0,500,50):
    for j in range(0,500,50):
        grids[str(places[loc])] = (j,i)
        loc += 1
p1_pos = 1
p2_pos = 1


board = pygame.image.load("assest/board.jpeg")
board = pygame.transform.scale(board,(500,500))
p1 = pygame.image.load("assest/p1.png")
p1 = pygame.transform.scale(p1,(50,50))
p2 = pygame.image.load("assest/p2.png")
p2 = pygame.transform.scale(p2,(50,50))
d1 = pygame.image.load("assest/dice1.png")
d1 = pygame.transform.scale(d1,(50,50))
d2 = pygame.image.load("assest/dice2.png")
d2 = pygame.transform.scale(d2,(50,50))
d3 = pygame.image.load("assest/dice3.png")
d3 = pygame.transform.scale(d3,(50,50))
d4 = pygame.image.load("assest/dice4.png")
d4 = pygame.transform.scale(d4,(50,50))
d5 = pygame.image.load("assest/dice5.png")
d5 = pygame.transform.scale(d5,(50,50))
d6 = pygame.image.load("assest/dice6.png")
d6 = pygame.transform.scale(d6,(50,50))



dice_assest = [d1,d2,d3,d4,d5,d6]
rolled = d1
def rolldice():
    return random.randint(1,6)

def checkPos(pos,who):
    global p1_pos,p2_pos
    if pos in snake_head:
        if who == 1:
            p1_pos = snake_tail[snake_head.index(pos)]
        else:
            p2_pos = snake_tail[snake_head.index(pos)]
    if pos in ladder_down:
        if who == 1:
            p1_pos = ladder_top[ladder_down.index(pos)]
        else:
            p2_pos = ladder_top[ladder_down.index(pos)]
        


def movePlayer(d,who):
    global p1_pos,p2_pos
    if who == 1:
        if p1_pos+d < 100:
            p1_pos += d
            checkPos(p1_pos,who)
    else:
        if p2_pos+d < 100:
            p2_pos += d
            checkPos(p2_pos,who)

turn = 1

def start():
    global rolled,turn
    while 1:
        screen.fill((203,203,234))
        screen.blit(board,(0,0))
        screen.blit(p1,grids[str(p1_pos)])
        screen.blit(p2,grids[str(p2_pos)])
        screen.blit(rolled,(225,525))
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
            if event.type == pygame.MOUSEBUTTONDOWN:
                pos = pygame.mouse.get_pos()
                if((225 < pos[0] <275 ) and (525 < pos[1] < 575)):
                    val = rolldice()
                    rolled = dice_assest[val-1]
                    movePlayer(val,turn)
                    if(turn == 1):
                        turn = 2
                    else:
                        turn = 1
        pygame.display.update()

start()
