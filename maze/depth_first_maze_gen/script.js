var rows, cols;
var mapWidth = 20;
var mapHeight = 20;
var grid = [];
var stack = [];
var current;

function setup() {
    createCanvas(400, 400);
    rows = floor(width / mapHeight);
    cols = floor(height / mapWidth);
    frameRate(12);
    for (var row = 0; row < rows; row++) {
        for (var col = 0; col < cols; col++) {
            grid.push(new cell(row, col));
        }
    }
    current = grid[0];
    stack.push(current);
}

function index(row, col) {
    if (row < 0 || col < 0 || col >= cols || row >= rows) {
        return -1;
    }
    return row * rows + col;
}

function draw() {
    background(51);
    current.visited = true;
    current.highlight();
    grid.map(x => x.show());
    var next = current.getRandomNeighbor();
    if (next) {
        stack.push(current);
        removeWalls(current, next);
        current = next;
    } else if (stack.length > 0) {
        current = stack.pop();
    }
}

function removeWalls(current, next) {
    var xdiff = current.row - next.row;
    if (xdiff === 1) {
        current.west = false;
        next.east = false;
    } else if (xdiff === -1) {
        current.east = false;
        next.west = false;
    }
    var ydiff = current.col - next.col;
    if (ydiff === 1) {
        current.south = false;
        next.north = false;
    } else if (ydiff === -1) {
        current.north = false;
        next.south = false;
    }
}

function cell(row, col) {
    this.row = row;
    this.col = col;
    this.north = true;
    this.south = true;
    this.west = true;
    this.east = true;
    this.visited = false;

    this.highlight = () => {
        var x = this.row * mapHeight;
        var y = this.col * mapWidth;
        noStroke();
        fill('white');
        rect(x, y, mapWidth, mapHeight);
    }

    this.show = () => {
        var x = this.row * mapHeight;
        var y = this.col * mapWidth;
        stroke(255);
        if (this.north) {
            line(x, y + mapHeight, x + mapWidth, y + mapHeight);
        }
        if (this.south) {
            line(x, y, x + mapWidth, y);
        }
        if (this.west) {
            line(x, y, x, y + mapHeight);
        }
        if (this.east) {
            line(x + mapWidth, y, x + mapWidth, y + mapHeight);
        }
        if (this.visited) {
            noStroke();
            fill(255, 0, 255, 100);
            rect(x, y, mapWidth, mapHeight);
        }
    }

    this.getRandomNeighbor = () => {
        var neighbors = []
        var north = grid[index(this.row - 1, this.col)];
        var south = grid[index(this.row + 1, this.col)];
        var west = grid[index(this.row, this.col - 1)];
        var east = grid[index(this.row, this.col + 1)];
        if (north && !north.visited) {
            neighbors.push(north);
        }
        if (south && !south.visited) {
            neighbors.push(south);
        }
        if (west && !west.visited) {
            neighbors.push(west);
        }
        if (east && !east.visited) {
            neighbors.push(east);
        }
        if (neighbors.length > 0) {
            r = floor(random(0, neighbors.length));
            return neighbors[r];
        }
        return undefined;
    }
}