#include <iostream>
#include <vector>
#include <memory>
#include <functional>
#include <fstream>
#include <iterator>


int main() {
    std::ifstream file("текст");
    std::cout<< "Text:"<< *std::istream_iterator<std::string>(file);
}