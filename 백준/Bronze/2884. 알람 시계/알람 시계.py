hour, minute = map(int, input().split())

if minute < 45:
  if hour == 0:
    hour = 23
    minute += 60
  else:
    hour -= 1
    minute += 60
  
print(hour, minute-45)