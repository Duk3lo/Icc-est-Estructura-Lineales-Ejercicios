def is_valid(signos: str) -> bool:
    stack = []

    for c in signos:
        if c in "([{":
            stack.append(c)

        elif c in ")]}":
            if not stack:
                return False

            ultimo = stack.pop()

            if not (
                (ultimo == '(' and c == ')') or
                (ultimo == '{' and c == '}') or
                (ultimo == '[' and c == ']')
            ):
                return False

    return len(stack) == 0
