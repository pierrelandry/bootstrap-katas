import unittest

from app.first import First


class FirstTest(unittest.TestCase):
    def setup_method(self, method):
        self.first = First()

    def test_hello_world(self):
        # Given
        expected = "Hello World!"

        # When
        actual = self.first.hello_world()

        # Then
        assert actual == expected


