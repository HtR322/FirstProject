package ru.htr.Kth;

public class KthOper {
    public long DigCap(long dignum){
        long sum = 0;
        long capacity = 0;
        while (true){
            long add = (long) (9 * Math.pow(10, capacity) * (capacity + 1));
            if (sum + add > dignum){
                return capacity + 1;
            }
            sum += add;
            capacity++;
        }
    }

    public long digNum(long dignum){
        long sum = 0;
        long capacity = 0;
        while (true){
            long add = (long) (9 * Math.pow(10, capacity) * (capacity + 1));
            if (sum + add > dignum){
                dignum -= sum;
                return dignum;
            }
            sum += add;
            capacity++;
        }
    }

    public long GetNum(long capacity, long num){
        return (long) Math.pow(10, capacity - 1) + num;
    }

    public int GetDig(long src, long capacity, long digNum){
        long dignum = capacity - digNum - 1;
        for (long i = 0; i < dignum; i++){
            src /= 10;
        }
        return (int)(src % 10);
    }

    public int GetDigit(long digNum){
        digNum--;
        long capacity = DigCap(digNum);
        digNum = digNum(digNum);
        long number = GetNum(capacity, digNum/capacity);
        int digit = GetDig(number, capacity, digNum % capacity);
        return digit;
    }
}
