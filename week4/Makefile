CC = gcc
CFLAGS = -W -Wall
SRCS = $(wildcard *.c)
OBJS = $(SRCS:.c=.o)

all: test
	@echo "빌드 성공"
test: $(OBJS)
	${CC} ${CFLAGS} -o $@ $^

clean:
	rm -rf *.o test
