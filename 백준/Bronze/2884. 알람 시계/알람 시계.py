hour, minute = input().split()

hour = int(hour)
minute = int(minute)

if minute - 45 < 0 and hour - 1 < 0:
  print(f"23 {(60 + (minute - 45))}")
elif minute - 45 < 0:
  print(f"{hour - 1} {(60 + (minute - 45))}")
else:
  print(f"{hour} {minute - 45}")