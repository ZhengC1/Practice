import sys, pygame


size = width, height = 900, 900
speed = [2, 2]
black = (0, 0, 0)
white = (255, 255, 255)

screen = pygame.display.set_mode(size)

while True:
    pygame.draw.line(screen, white, [0, 0], [width, height], 5)
    pygame.draw.ellipse(screen, white, [20, 20, 10, 25], 0)
    pygame.draw.circle(screen, (0, 0, 255), (150, 50), 15, 1)
