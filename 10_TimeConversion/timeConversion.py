import re

def timeConversion(s):
    if re.search(r'am$', s, flags=re.IGNORECASE):
        s = re.sub(r'am$', '', s, flags=re.IGNORECASE)
        time = [int(i) for i in s.split(':')]
        time[0] = time[0]%12

    if re.search(r'pm$', s, flags=re.IGNORECASE):
        s = re.sub(r'pm$', '', s, flags=re.IGNORECASE)
        time = [int(i) for i in s.split(':')]
        time[0] = (time[0]%12)+12

    result = ':'.join(str(i).zfill(2) for i in time)
    return result

if __name__ == '__main__':
    s = input("Insert the hour: ")

    result = timeConversion(s)
    print(result)
