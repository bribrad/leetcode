"""
Is Valid Parenthesis
LC # 20
Completed: 1/30/2026

"""

def isValid(s: str) -> bool:
        brackets = []
        for c in s:
            if c in ['[', '(', '{']:
                brackets.append(c)
            elif c in [']', ')', '}']:
                try:
                    lastVal = brackets.pop()
                    match c:
                        case ']':
                            if lastVal is not '[':
                                return False
                        case ')':
                            if lastVal is not '(':
                                return False
                        case '}':
                            if lastVal is not '{':
                                return False
                except IndexError:
                    return False
        return len(brackets) is 0

print(isValid("()[]{}"))
print(isValid("(]"))
print(isValid("([)]"))
print(isValid("{[]}"))
print(isValid("[({})](]"))
