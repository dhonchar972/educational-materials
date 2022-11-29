from abc import ABC, abstractmethod


class Interface(ABC):
    @abstractmethod
    def do_work(self, num: int) -> int:
        """Do some work"""
