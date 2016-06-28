object Direction {

  case object East extends Direction {
    def forward(p: Position)  = p.copy(x = p.x + 1)
    def backward(p: Position) = p.copy(x = p.x - 1)
  }

  case object North extends Direction {
    def forward(p: Position)  = p.copy(y = p.y + 1)
    def backward(p: Position) = p.copy(y = p.y - 1)
  }

  case object West extends Direction {
    def forward(p: Position)  = p.copy(x = p.x - 1)
    def backward(p: Position) = p.copy(x = p.x + 1)
  }

  case object South extends Direction {
    def forward(p: Position)  = p.copy(y = p.y - 1)
    def backward(p: Position) = p.copy(y = p.y + 1)
  }

}

sealed trait Direction {
  def forward(position: Position): Position
  def backward(position: Position): Position
}
